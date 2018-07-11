package com.lw.guava.demo.test;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.lw.guava.demo.vo.ScoreRecord;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ScoreRecord stu1 = new ScoreRecord("小王", "74", "2018-07-01 12:00:00");
        ScoreRecord stu2 = new ScoreRecord("小王", "85", "2018-07-02 12:00:00");
        ScoreRecord stu3 = new ScoreRecord("小王", "96", "2018-07-11 12:00:00");
        ScoreRecord stu4 = new ScoreRecord("小王", "96", "2018-07-11 12:00:00");
        ScoreRecord stu5 = new ScoreRecord("小王", "52", "2018-07-05 12:00:00");
        ScoreRecord stu6 = new ScoreRecord("小王", "74", "2018-07-06 12:00:00");
        ScoreRecord stu7 = new ScoreRecord("小王", "68", "2018-07-11 12:00:00");
        List<ScoreRecord> stuList1 = Lists.newArrayList(stu1,stu2,stu3,stu5);
        List<ScoreRecord> stuList2 = Lists.newArrayList(stu4,stu6,stu7);
        Set<ScoreRecord> scoreRecords1 = Sets.newHashSet(stuList1);
        Set<ScoreRecord> scoreRecords2 = Sets.newHashSet(stuList2);
        Sets.SetView<ScoreRecord> union = Sets.union(scoreRecords1, scoreRecords2);
        System.out.println("并集后：");
        union.forEach(scoreRecord -> System.out.println(scoreRecord));
        Ordering<Comparable> natural = Ordering.natural();
        List<ScoreRecord> list = Lists.newArrayList(union);
        Comparator<ScoreRecord> byTestDate = new Comparator<ScoreRecord>() {
            @Override
            public int compare(final ScoreRecord p1, final ScoreRecord p2) {
                return p1.getTestDate().compareTo(p2.getTestDate());
            }
        };
        List<ScoreRecord> list1 = Ordering.from(byTestDate).reverse().sortedCopy(list);
        // Collections.sort(list,new Sortclass());
        System.out.println("并集排序后：");
        list1.forEach(scoreRecord -> System.out.println(scoreRecord));
    }

    static class Sortclass implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            ScoreRecord sr1 = (ScoreRecord)o1;
            ScoreRecord sr2 = (ScoreRecord)o2;
            return sr1.getTestDate().compareTo(sr2.getTestDate());
        }
    }
}
