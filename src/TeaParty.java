public class TeaParty {

       public String welcome(String name, boolean isWoman, boolean isKnighted)
       {
    	   String title = null;
    	   		if (isKnighted == true && isWoman == true) {
    	   			title = "Lady ";
    	   		}
    	   		if (isKnighted == false && isWoman == true) {
    	   			title = "Ms. ";
    	   		}
    	   		if (isKnighted == true && isWoman == false) {
    	   			title = "Sir ";
    	   		}
    	   		if (isKnighted == false && isWoman == false) {
    	   			title = "Mr. ";
    	   		}
				return "Hello " + title + name;
       }

}