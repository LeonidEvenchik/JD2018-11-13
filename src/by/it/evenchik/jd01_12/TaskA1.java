package by.it.evenchik.jd01_12;

import by.it.nickgrudnitsky.jd01_04.TaskA;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class TaskA1 {

    private List<Integer>list=new ArrayList<>();

    private void clearBad (List <Integer> grades){
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()){
            int grade = iterator.next();
            if(grade< 4)
            iterator.remove();

        }

    }


    public static void main(String[] args) {
        TaskA1 task = new TaskA1();
        for (int i = 0; i <25 ; i++) {
            task.list.add((int) Math.round(Math.random()*10));

        }
        System.out.println(task.list);
        task.clearBad(task.list);
        System.out.println(task.list);
    }
}
