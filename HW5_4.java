import java.util.Scanner;

public class HW5_4{
	public static void main(String [] args){
		System.out.print("����: ");
		String str = Search.input();
		System.out.print("�˻��� �ܾ�: ");
		String word = Search.input();
		Search.search(str, word);
	}
}

class Search{
	public static String input(){
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	public static void search(String str, String word){
		int len = word.length();
		int cnt = 0;
		int eojeol = 1;
		System.out.print("�˻� ���: ");
		for(int i=0; i<str.length()-len+1; i++){
			if(str.charAt(i)==' ') eojeol++;
			if(word.equalsIgnoreCase(str.substring(i, i+len))){
				cnt++;
				System.out.print(eojeol+"��°, ");
			}
		}
		if(cnt>0) System.out.printf("\b\b �������� \"%s\"�� �˻��Ǿ�, �� %dȸ �˻��Ǿ����ϴ�.\n", word, cnt);
		else System.out.println("�� 0ȸ �˻��Ǿ����ϴ�.");
	}
}