import leetcode.amazon.TopKFrequentlyMentionedKeywords;

public class Main {
	
	public static void main(String[] args) {
    double start = System.currentTimeMillis(); 
//====TEST===============================================

    String[] keywords = {"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
    
    String[] reviews = {
       "I love anacell Best services; Best services provided by anacell",
  "betacellular has great services",
  "deltacellular provides much better services than betacellular",
  "cetracular is worse than anacell1",
  "Betacellular is better than deltacellular."
          };

    int k = 2;

    System.out.print("Output : " + TopKFrequentlyMentionedKeywords.find(keywords, reviews, k));

   
//====TEST==============================================
    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	}

}
