package stream;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
  public static void main(String[] args) {
    Stream<Nation> s1 = Nation.nations.stream();
    Double avg = s1.collect(Collectors.averagingDouble(Nation::getPopulation));
    System.out.println("인구의 평균: " + avg);

    Stream<Nation> s2 = Nation.nations.stream();
    Long count = s2.count();
    System.out.println("나라 개수: " + count);

    Stream<Nation> s3 = Nation.nations.stream();
    String names = s3.limit(4) // 4개의 나라, 이름만을 가지고 다른 stream 반환
        .map(Nation::getName)
        .collect(Collectors.joining("-"));
    System.out.println("4개의 나라: (-) " + names);

    Stream<Nation> s4 = Nation.nations.stream();
    String names1 = s4.limit(4).map(Nation::getName).collect(Collectors.joining("-"));
    System.out.println("4개의 나라: (-) " + names1);

    Stream<Nation> s5 = Nation.nations.stream();
    Optional<Double> max = s5.map(Nation::getPopulation).max(Double::compare);
    System.out.println("최대 인구를 가진 나라의 인구수: " + max.get());

    Stream<Nation> s6 = Nation.nations.stream();
    IntSummaryStatistics gdpRank = s6.collect(Collectors.summarizingInt(Nation::getGdpRank));
    System.out.println("gdpRank = " + gdpRank);
  }
}
