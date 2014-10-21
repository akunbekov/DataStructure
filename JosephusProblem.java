/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephusproblem;

import java.util.*;

/**
 *
 * @author Tima
 */
public class JosephusProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numPeople, skip, targetIndex;
        List<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        // get the initial number of soldiers 
        System.out.print("Enter the number of soldiers: ");
        numPeople = in.nextInt();
        in.nextLine();  

        // get the number of soldiers to skip 
        System.out.print("Enter the number of soldiers to skip: ");
        skip = in.nextInt(); 
        // load the initial list of soldiers 
        for (int count = 1; count <= numPeople; count++)
        {
            list.add("Soldier " + count);
        }
		
        targetIndex = skip; 
        System.out.println("The order is: ");
      
        // Treating the list as circular, remove every nth element
        // until the list is empty 
        while (!list.isEmpty()) 
        {
            System.out.println(list.remove(targetIndex));
            if (list.size() > 0)
                targetIndex = (targetIndex + skip) % list.size();
        }

    }
    
}
