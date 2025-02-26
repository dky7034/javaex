#!/bin/sh

WATCH_DIR="."  # 현재 폴더를 감시
BRANCH=$(git branch --show-current)

echo "🔄 파일 변경 감지 중... (저장하면 자동으로 Git 반영됩니다)"

while true
do
    inotifywait -r -e modify,create,delete "$WATCH_DIR"
    
    echo "✅ 변경 감지! Git 자동 커밋 & 푸시 실행 중..."
    git add .
    git commit -m "Auto commit: $(date)"
    git push origin "$BRANCH"
    
    echo "🚀 Git 자동 반영 완료!"
    sleep 2  # 너무 빠른 반복 실행 방지
done
