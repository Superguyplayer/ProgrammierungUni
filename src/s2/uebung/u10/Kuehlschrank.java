package s2.uebung.u10;

import java.util.HashMap;

public class Kuehlschrank {

    private HashMap<String, Integer> content = new HashMap<>();

    public void addContent(String content, int quantity) throws Kuehlschrankexception{
        if(this.content.containsKey(content)) {
            this.content.replace(content, this.content.get(content) + quantity);
        }else{
                this.content.put(content, quantity);

        }
    }

    public void getContent(){
        for (String s: this.content.keySet()) {

            System.out.println(s + ": " + this.content.get(s));

        }
    }


}
