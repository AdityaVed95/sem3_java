package java_sem3_assignments_OOPM.lab8.pass_by_reference_in_priority_que;

import java.util.PriorityQueue;

public class ModifierClass
{
    PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();

    ModifierClass(PriorityQueue<Integer> priorityQueue1)
    {
        this.priorityQueue1 = priorityQueue1;
    }

    void modify()
    {
        priorityQueue1.add(10);
    }


}
