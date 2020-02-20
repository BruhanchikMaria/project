package Compare;

import java.util.TreeSet;

public class PhoneMain {
    public static void main(String[] args) {
        TreeSet<PhoneSort> myPhoneList = new TreeSet<PhoneSort>();
        PhoneSort first = new PhoneSort("Apple", 1000, true);
        PhoneSort second = new PhoneSort("Samsung", 800, true);
        PhoneSort third = new PhoneSort("Nokia", 750, false);
        PhoneSort forth = new PhoneSort("Huawei", 850, false);

        myPhoneList.add(first);
        myPhoneList.add(second);
        myPhoneList.add(third);
        myPhoneList.add(forth);

        for (PhoneSort s : myPhoneList) {
            System.out.println(s);
        }
    }
}
