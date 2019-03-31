public class YorN {

    public boolean canBeEqualTo24(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int ij = 0; ij < nums.length; ij++) {
                    if (i == ij || j == ij) {
                        continue;
                    }
                    for (int ji = 0; ji < nums.length; ji++) {
                        if (i == ji || j == ji || ij == ji) {
                            continue;
                        }

                        if ((new Nums().option(nums[i], nums[j], nums[ij], nums[ji])) == true) {
                            return true;
                        }
                    }
                }
            }
        }
        System.out.println("Пояснение: из данного набора чисел невозможно составить выражение, равное 24");
        return false;
    }
}

