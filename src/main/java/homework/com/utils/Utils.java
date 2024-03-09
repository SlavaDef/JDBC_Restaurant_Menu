package homework.com.utils;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Utils {

    public static <T> void printingEntity(List<T> t){
        for (T cl : t) {
            System.out.println(cl);
        }
    }


}
