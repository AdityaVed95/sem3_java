package java_sem3_assignments_OOPM.lab8.pass_by_reference_in_priority_que;

import java.util.PriorityQueue;

public class Launcher
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> priorityQueueInMain = new PriorityQueue<>();
        priorityQueueInMain.add(5);
        priorityQueueInMain.add(7);
        ModifierClass rg1 = new ModifierClass(priorityQueueInMain);
        rg1.modify();
        System.out.println(priorityQueueInMain);
    }
}
