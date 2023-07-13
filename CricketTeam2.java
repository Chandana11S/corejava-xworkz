class CricketTeam2{
	static String players[] = {"virat kohli", "rohit sharma", " jadeja", "axar patel", "shubman gill", " hardik pandy", " ms Dhoni", "shreyas iyer", "r ashwin", " rishabh pant"};
	static String teams[] = {"australian", " pakistan", "india", " west indies", "sri lanka", "england", "bangaladesh", "new zealand", "south africa", "nepal"};
	static String iplTeams[] = {"RCB", "CSK", "MI","GT", "KKR", "RR", "SH", "DC", "LSG","PK"};
	
public static void main(String cricketTeam[]){

//foreach
for(String player : players){
System.out.println(player);
}

for(String team : teams){
System.out.println(teams);
}

for(String iplTeam : iplTeams){
System.out.println(iplTeam);
}

}
}
