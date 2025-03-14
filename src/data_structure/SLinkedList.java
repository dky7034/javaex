package data_structure;

public class SLinkedList<E> {
  // 필드
  // 헤드 노드 (첫 번째 노드)
  private Node<E> head;
  // 테일 노드 (마지막 노드)
  private Node<E> tail;
  // 원소의 개수 - size
  private int size;

  // 생성자
  public SLinkedList() {
    // 헤드 노드와, 테일 노드의 주소값을 null 로 초기화합니다.
    head = tail = null;
    // 생성된 리스트의 사이즈를 0으로 초기화합니다.
    size = 0;
  }

  // 탐색, 삽입, 삭제 , size, isEmpty 를 구하는 메서드 구현
  // 리스트 사이즈를 리턴하는 메서드
  int size() {
    return size;
  }

  // 리스트가 비어있는지를 참, 거짓으로 리턴하는 메서드
  // 비어있으면 참, 비어있지 않으면 거짓 리턴
  // head == tail == null 이면 참을 리턴합니다.
  public boolean isEmpty() {
    return size == 0;
  }

  // 리스트의 마지막에 아이템을 추가하는 메서드
  void addLast(E item) {
    // 새로운 노드를 생성합니다.
    // 매개변수로 아이템과, 테일 노드(마지막 노드)를 받습니다.
    Node<E> newNode = new Node<>(item, tail);
//    newNode.item = item;
//    newNode.next = tail;
    // 리스트의 사이즈를 확인합니다.
    // 만약 리스트가 비어있으면 head 에 새로운 노드를 참조시킵니다.
    if (size == 0) { // head == tail && head == null
      head = newNode;
    } else {
      // 리스트가 비어있지 않다면, 마지막 노드에 새로운 노드를 저장합니다.
      // 노드의 인덱스도 0부터 시작하므로
      getNode(size - 1).next = newNode;
    }
    //
    tail = newNode;
    size++;
  }

  void addFirst(E e) {
    // 1단계 : 새로운 노드를 생성한 후 node의 값을 설정한다음
    // 새로 생성된 노드가 맨 앞으로 가도록 한다.
    // < === 1) 여기를 구현한다.
    Node<E> newNode = new Node<>(e, head);

    // 2단계 : 현재 데이터가 없는 경우, 즉 빈 리스트인 경우
    // head 와 tail 모두 newNode 가 되도록 처리한다.
    // 리스트에 데이터가 있을 경우에는 head 만 새로 추가된 노드로 변경해준다.
    // < === 2) 여기를 구현한다.
    if (size == 0) {
      tail = newNode;
    }
    // 리스트의 사이즈가 0이 아닐 경우에는 head 만 새로 추가된 노드로 변경하면 됩니다.
    head = newNode;
    // 3단계
    // 데이터가 하나 추가되었기 때문에 리스트의 사이즈를 하나 증가시킨다.
    // < === 3) 여기를 구현한다.
    size++;
  }

  // 특정 노드 인덱스의 아이템(값)을 리턴하는 메서드입니다.
  E getValue(int index) {
    // find 참조변수에 헤드 노드(첫 번째 노드)를 저장합니다.
    Node<E> find = head;
    //
    for (int i = 0; i < index; i++) {
      find = find.next;
    }
    return find.item;
  }

  // 특정 노드를 찾는 메서드입니다.
  // 매개변수로 인덱스 번호를 받습니다.
  Node<E> getNode(int index) {
    // 노드의 헤드를 찾습니다.
    // find 참조변수에 헤드 노드를 저장합니다.
    Node<E> find = head;
    // 헤드 노드의 아이템(값)을 출력합니다.
    System.out.println(find.item);
    // for 반복문을 통해,
    //
    for (int i = 0; i < index; i++) {
      System.out.println(find.item);
      find = find.next;
    }
    return find;
  }

  E removeLast() {
    // 1단계 : 맨 마지막 노드를 지우기 전 백업받아놓는다. removedNode
    // <=== 1) 여기를 구현한다.
    // 2-1단계 : 데이터가 2개 이상인 경우 (즉, 마지막 노드를 지워도 리스트가 비어있지 않은 경우)
    // 지우려는 노드의 바로 이전 노드를 찾아온다.
    // 마지막 노드를 삭제처리한다.
    // <=== 2) 여기를 구현한다.
    // 2-2단계 : 데이터가 1개만 있는 경우 (즉, 삭제하면 빈 리스트가 되는 경우)
    // head 와 tail 모두 null 로 만들어준다.
    // <=== 3) 여기를 구현한다.
    // 3단계 :  노드가 하나 삭제되었기 때문에 사이즈를 하나 줄여준다.
    // <=== 4) 여기를 구현한다.
    // 4단계 : 삭제된 노드(백업받아놓음)를 반환한다.
    // <=== 5) 여기를 수정하여 완성한다.
    return null;
  }

  E removeFirst() {
    Node<E> removedNode = head;
    head = head.next;
    removedNode.next = null;
    if (size == 1) {
      head = tail = null;
    }
    size--;
    return removedNode.item;
  }

  // 노드 클래스
  // 노드는 다음 노드의 주소값, 자기의 값(아이템)을 필드로 가집니다.
  private class Node<E> {
    // 필드
    // 이 필드는 아이템 데이터 타입의 필드입니다.
    E item;
    // 이 필드는 노드(객체)를 타입으로 하는 필드입니다.
    // 필드 타입을 Node<E>로 해야 노드의 주소값을 받을 수 있습니다.
    Node<E> next;

    // 생성자
    public Node(E newItem, Node<E> node) {
      this.item = newItem;
      this.next = node;
    }
  }

  @Override
  public String toString() {
    String list = "[";
    for (Node<E> n = head; n.next != null; n = n.next) {
      list += n.item + ",";
    }
    return "SLinkedList" +
        list + "]";
  }

} // end of class