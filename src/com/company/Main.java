/* Module 3. Task 1
 * Classname: Main
 *
 * Version 1
 *
 * Herman Zviertsev, NTU KhPI
 *
 *
 * 1. Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
 * 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
 * 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 * 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 */
package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
//Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
        LocalDateTime startCreatingTime = LocalDateTime.now();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i<= 100000; i++) {
            arrayList.add(i);
        }
        LocalDateTime finishCreatingTimeArrayList = LocalDateTime.now();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i<= 100000; i++) {
            linkedList.add(i);
        }

        LocalDateTime finishCreatingTimeLinkedList = LocalDateTime.now();
        long arrayCreatingTime =
                ChronoUnit.MILLIS.between(startCreatingTime, finishCreatingTimeArrayList);
        long linkedCreatingTime =
                ChronoUnit.MILLIS.between(finishCreatingTimeArrayList, finishCreatingTimeLinkedList);
        System.out.println("ArrayList creation time is " + arrayCreatingTime+ " m.s.\n"
                +"LinkedList creation time is " + linkedCreatingTime + " m.s.");
        System.out.println("Lower time interval of creation has "
                + (arrayCreatingTime < linkedCreatingTime?
                "ArrayList creation" : "LinkedList creation."));

//Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
//Adding elements to Array List
        LocalDateTime timeStartToAddArrayList = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.add(0, 1);
        }
        LocalDateTime timeFinishToAddToArrayListBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.add(arrayList.size() / 2, 2);
        }
        LocalDateTime timeFinishToAddToArrayListMiddle = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.add(3);
        }
        LocalDateTime timeFinishToAddToArrayListInTheEnd = LocalDateTime.now();
//Interval time counting of adding to ArrayList elements
        long addingElementsInArrayListInBeginning =
                ChronoUnit.MILLIS.between(timeStartToAddArrayList, timeFinishToAddToArrayListBeginning);
        long addingElementsInArrayListInMiddle =
                ChronoUnit.MILLIS.between(timeFinishToAddToArrayListBeginning, timeFinishToAddToArrayListMiddle);
        long addingElementsInArrayListInTheEnd =
                ChronoUnit.MILLIS.between(timeFinishToAddToArrayListMiddle, timeFinishToAddToArrayListInTheEnd);
        System.out.println( "Time interval of adding elements in array in beginning is "
                + addingElementsInArrayListInBeginning + " m.s.\n"
                + "Time interval of adding element in array in middle is "
                + addingElementsInArrayListInMiddle+ " m.s.\n"
                + "Time interval of adding element in array in the end is  "
                + addingElementsInArrayListInTheEnd + " m.s \n");
//Adding elements to Linked List
        LocalDateTime timeStartToAddToLinkedList = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.add(0, 1);
        }
        LocalDateTime timeFinishToAddToLinkedListInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.add(linkedList.size() / 2, 1);
        }
        LocalDateTime timeFinishToAddToLinkedListInMiddle= LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.add(1);
        }
        LocalDateTime timeFinishToAddToLinkedListInTheEnd = LocalDateTime.now();
//Interval time counting of adding to LinkedList elements
        long timeIntervalAddingToLinkedListInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartToAddToLinkedList, timeFinishToAddToLinkedListInBeginning );
        long timeIntervalAddingToLinkedListInMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinishToAddToLinkedListInBeginning, timeFinishToAddToLinkedListInMiddle);
        long timeIntervalAddingToLinkedListInTheEnd  =
                ChronoUnit.MILLIS.between
                        (timeFinishToAddToLinkedListInMiddle, timeFinishToAddToLinkedListInTheEnd);

        System.out.println("Time interval of adding elements in linked list in beginning "
                + timeIntervalAddingToLinkedListInBeginning + " m.s.\n"
                +"Time interval of adding elements in linked list in midle "
                + timeIntervalAddingToLinkedListInMiddle + " m.s.\n"
                + "Time interval of adding elements in linked list in the end "
                + timeIntervalAddingToLinkedListInTheEnd  + " m.s.\n");
//Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals
//Updating Elements in Array List
        LocalDateTime timeStartToUpdateArrayList = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.set(0, 1);
        }
        LocalDateTime timeFinishToUpdateArrayListInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.set(arrayList.size() / 2, 1);
        }
        LocalDateTime timeFinishToUpdateArrayListInMiddle = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.set(arrayList.size() - 1, 1);
        }
        LocalDateTime timeFinishToUpdateArrayListInTheEnd = LocalDateTime.now();
//Interval time counting of Updating in Array List elements
        long updatingElementsInArrayInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartToUpdateArrayList, timeFinishToUpdateArrayListInBeginning);
        long updatingElementsInArrayInMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinishToUpdateArrayListInBeginning, timeFinishToUpdateArrayListInMiddle);
        long updatingElementsInArrayInTheEnd =
                ChronoUnit.MILLIS.between
                        (timeFinishToUpdateArrayListInMiddle, timeFinishToUpdateArrayListInTheEnd);
        System.out.println("Time interval of updating ArrayList in beginning is "
                + updatingElementsInArrayInBeginning + " m.s.\n"
                +"Time interval of updating ArrayList in middle is "
                + updatingElementsInArrayInMiddle + " m.s.\n"
                +"Time interval of updating ArrayList in the end is "
                + updatingElementsInArrayInTheEnd + " m.s.\n");
//Updating Elements in Linked List
        LocalDateTime timeStartToUpdateLinkedList = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.add(0, 1);
        }
        LocalDateTime timeStartToUpdateLinkedListInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.add(linkedList.size() / 2, 1);
        }
        LocalDateTime timeStartToUpdateLinkedListInMiddle  = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.add(arrayList.size() - 1, 1);
        }
        LocalDateTime timeStartToUpdateLinkedListInTheEnd = LocalDateTime.now();
//Interval time counting of Updating in Linked List elements
        long updatingElementsInLinkedListInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartToUpdateLinkedList, timeStartToUpdateLinkedListInBeginning );
        long updatingElementsInLinkedListInMiddle =
                ChronoUnit.MILLIS.between
                        (timeStartToUpdateLinkedListInBeginning , timeStartToUpdateLinkedListInMiddle);
        long updatingElementsInLinkedListInTheEnd =
                ChronoUnit.MILLIS.between
                        (timeStartToUpdateLinkedListInMiddle, timeStartToUpdateLinkedListInTheEnd);

        System.out.println("Time interval of Updating Linked list in beginning is "
                + updatingElementsInLinkedListInBeginning + " m.s.\n"
                +"Time interval of Updating Linked list in middle is "
                + updatingElementsInLinkedListInMiddle + " m.s.\n"
                +"Time interval of Updating Linked list in the end is "
                + updatingElementsInLinkedListInTheEnd + " m.s.\n");
//Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
//Deleting Elements from Array list
        LocalDateTime timeStartToDeleteElementsFromArrayList = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.remove(0);
        }
        LocalDateTime timeFinishToDeleteElementsFromArrayListInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        LocalDateTime timeFinishToDeleteElementsFromArrayListInMiddle = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        LocalDateTime timeFinishToDeleteElementsFromArrayListInTheEnd = LocalDateTime.now();
//Time interval counting of elements deleting from ArrayList
        long deleteArrayInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartToDeleteElementsFromArrayList, timeFinishToDeleteElementsFromArrayListInBeginning );
        long deleteArrayInMiddle =
                ChronoUnit.MILLIS.between
                        (timeFinishToDeleteElementsFromArrayListInBeginning , timeFinishToDeleteElementsFromArrayListInMiddle);
        long deleteArrayInTheEnd =
                ChronoUnit.MILLIS.between
                        (timeFinishToDeleteElementsFromArrayListInMiddle, timeFinishToDeleteElementsFromArrayListInTheEnd);
        System.out.println("Time interval of deleting elements from Array list in beginning is "
                + deleteArrayInBeginning + " m.s.\n"
                +"Time interval of deleting elements from Array list in middle is "
                + deleteArrayInMiddle + " m.s.\n"
                +"Time interval of deleting elements from Array list in the end is "
                + deleteArrayInTheEnd + " m.s.\n");
//Deleting Elements from Linked list
        LocalDateTime timeStartDeletingElementsFromLinkedList = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.remove(0);
        }
        LocalDateTime timeFinishDeletingElementsFromLinkedListInBeginning = LocalDateTime.now();
        for (int i = 0; i<= 1000; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        LocalDateTime  timeFinishDeletingElementsFromLinkedListInMiddle  = LocalDateTime.now();

        for (int i = 0; i<= 1000; i++) {
            linkedList.remove(arrayList.size() - 1);
        }
        LocalDateTime  timeFinishDeletingElementsFromLinkedListInTheEnd = LocalDateTime.now();
//Time interval counting of deleting elements from Linked List
        long deletingElementsInLinkedListInBeginning =
                ChronoUnit.MILLIS.between
                        (timeStartDeletingElementsFromLinkedList,  timeFinishDeletingElementsFromLinkedListInBeginning );
        long deletingElementsInLinkedListInMiddle =
                ChronoUnit.MILLIS.between
                        ( timeFinishDeletingElementsFromLinkedListInBeginning ,  timeFinishDeletingElementsFromLinkedListInMiddle);
        long deletingElementsInLinkedListInTheEnd =
                ChronoUnit.MILLIS.between
                        ( timeFinishDeletingElementsFromLinkedListInMiddle,  timeFinishDeletingElementsFromLinkedListInTheEnd );

        System.out.println("TTime interval of deleting elements from Linked in beginning is "
                + deletingElementsInLinkedListInBeginning  + " m.s.\n"
                +"Time interval of deleting elements from Linked  in middle is "
                + deletingElementsInLinkedListInMiddle + " m.s.\n"
                +"Time interval of deleting elements from Linked in the end is "
                + deletingElementsInLinkedListInTheEnd + " m.s.");
    }
}
