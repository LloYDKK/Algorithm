package tk.A1025_A1049;


/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1030_team implements Comparable<Object>{
	public String teamName;
	public int score;
	public int winball;
	public int gotscore;
	
	public A1030_team(String a, int b, int c, int d) {
		this.teamName=a;
		this.score=b;
		this.winball=c;
		this.gotscore=d;	
	}
	
	public int compareTo(Object o) {
		A1030_team obj = (A1030_team)o;
		if(obj.score>score) return 1;
		else if(obj.score<score) return -1;
		else {
			if(obj.winball>winball) return 1;
			else if(obj.winball<winball) return -1;
			else {
				if(obj.gotscore>gotscore) return 1;
				else if(obj.gotscore<gotscore) return -1;
				else return obj.teamName.compareTo(teamName);
			}
		}
	}
	
}
