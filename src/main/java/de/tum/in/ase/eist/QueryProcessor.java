package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();

            if (query.contains("which of the following numbers is the largest: ")){
                query=query.replace("which of the following numbers is the largest: ","");
                String[] numbers=query.split(", ");
                int x = 0;
                for (String n:numbers) {
                    if(Integer.getInteger(n)>x){x=Integer.getInteger(n);}
                }
                return String.valueOf(x);
            }else{
                if(query.contains("what is")){
                    query=query.replace("what is","");
                    query=query.replace("plus ","");
                    String[] numbers=query.split(" ");
                    int x = 0;
                    for (String n:numbers) {
                        x+=Integer.getInteger(n);
                    }
                    return String.valueOf(x);
                }

            }

        return "";
    }
}
