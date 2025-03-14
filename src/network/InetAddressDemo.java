package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
  public static void main(String[] args) {
    InetAddress address = null;

    Scanner in = new Scanner(System.in);
    System.out.print("호스트 이름을 입력하세요: ");
    String url = in.nextLine();

    try {
      address = InetAddress.getByName(url);
    } catch (UnknownHostException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(url + "의 ip 주소는 " + address);
  }
}

