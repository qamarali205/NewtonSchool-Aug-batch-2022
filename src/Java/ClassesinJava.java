static class Student
{
     public String name=null;
    public int eng=0;
    public int maths=0;
    public int hindi=0;

    Student(String name, int eng,int maths,int hindi){
        this.name=name;
        this.eng=eng;
        this.maths=maths;
        this.hindi=hindi;
    }
}
static Student[] createStudentArray(int n)
    {
       Student [] arr = new Student[n];
       //Enter your code here
       for(int i=0;i<n;i++){
           String name = sc.next();
           int eng = sc.nextInt();
           int maths = sc.nextInt();
           int hindi = sc.nextInt();
           arr[i]=new Student(name,eng,maths,hindi);

       }
       return arr;

    }
    
    static int engAverage(Student st[], int n)
    {
        //Enter your code here
        int average=0;
        for(int i = 0;i<n;i++){
            average+=st[i].eng;
        }
        average = average/n;
        return average;

    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
         //Enter your code here
        int sum =0;

        for(int i=0;i<n;i++){
            sum += ((st[i].eng+st[i].maths+st[i].hindi)/3);
        }
        int average = sum/n;
        return average;
    }