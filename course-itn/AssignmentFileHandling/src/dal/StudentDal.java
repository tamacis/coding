/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import backends.StorageBackend;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import mappers.StudentMapper;
import props.Student;

/**
 *
 * @author cswl
 */
public class StudentDal {
        public static ArrayList<Student> getStudents() {
        ArrayList<Student> st = new ArrayList<>();
        StorageBackend sctrl = new StorageBackend();
        ArrayList<String> sl = sctrl.read();

        for (String s : sl) {
            String[] sa = s.split("\\s*,\\s*");
            Student std;
            if ((std = StudentMapper.parse(sa)) != null) {
                st.add(std);
            }
        }
        return st;
    }
public static int generateUniqueID() {
        ArrayList<Student> st = StudentDal.getStudents();

        ArrayList<Integer> ids = new ArrayList<>();
        for (Student s : st) {
            ids.add(s.getId());
        }

        if (!ids.isEmpty()) {
            IntSummaryStatistics is = ids.stream().
                    collect(IntSummaryStatistics::new, IntSummaryStatistics::accept,
                            IntSummaryStatistics::combine);
            int res = is.getMax() + 1;
            return res;
        }
        return 1;
}
}
