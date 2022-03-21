public class B_OperatorB {
    public static void main(String[] args) {
        //mengamati hasil perubahan nilai dari suatu operasi matematis
        float total = 14000;
        System.out.println("original investment:$"+total);
        // Increases by 40 percent thr firs year
        total=total+(total*.4f);
        System.out.println("after one year:$"+total);
        //Loses $1,500 the second year
        total =total-1500f;
        System.out.println("after two years:$"+total);
        //Increases by 12 percent the third year
        total=total+(total*.12f);
        System.out.println("after theree years:$"+total);

    }
}
