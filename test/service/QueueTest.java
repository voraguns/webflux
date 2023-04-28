package service;

public class QueueTest {
    public void caseQueue() {
        Queue<String> queue = new Queue<String>();
        queue.add("Latte");
        queue.add("Mocha");
        queue.add("Cappucino");
        String f =queue.get();
        assert "Latte".equals(f);
        String f2 = queue.get();
        assert "Mocha".equals(f2);
    }
    
    public void testAutoExpand() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 7; i < 100; i++) {
            q.add(i);
        }
        Integer f = q.get();
        assert f == 7;
        assert q.get() == 8;
        assert q.get() == 9;
    }
}
