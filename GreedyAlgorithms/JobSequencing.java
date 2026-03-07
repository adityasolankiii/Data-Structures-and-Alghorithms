package GreedyAlgorithms;

import java.util.ArrayList;

public class JobSequencing {
    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int id, int[] job){
            this.id = id;
            this.deadline = job[0];
            this.profit = job[1];
        }
    }

    public static void main(String[] args) {
        int[][] jobInfo = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i]));
        }

        jobs.sort((obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        /*for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }*/

        for (Job curr : jobs) {
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println(seq.size());
        System.out.println(seq);
    }
}
