public static void main(string[]args)
{
scanner input=new scanner(system.in);
//scanner object to read input

system.out.print("studentName:");
string studentName=input.next();
//reading studentName

system.out.print("grade:");
double grade=input.nextDouble();
//reading student garde

string output="";
if (grade>=80&&grade<=100)//if grade is between 80 and 100
{
output="Hey"+studentName+"the letter grade for your "+grade+"% is A";
//storing grade to output storing
}
else if (grade>=70&&grade<=79.9)//ifthe grade is between 70 snd 79.9
{
ouput="the letter grade for " +grade+"% is B";// storing grade to output storing
}
else if (grade>=60&&grade<=69.9)//if the grade is between 60 and 69.9
{
output="the letter grade for "+grade+"% is C";//storing grade to output string
}
else if (grade>=50&&grade<=59.9)// if the grade between 50 and 59.9
{
output="the letter grade for "+ grade+"% is D";//storing grade to output  string
}
else if (grade>=0&&grade<=49.9)// if the grade is between 0 and 49.9
{
output="the letter  grade for "+grade+"%is F";//storing grade to output string
}
else//if the given grade is not in range of 0-100
{
output="invalid input!";//storing grade to output storing
}
system.out.println(output);//printing the output
}
}
