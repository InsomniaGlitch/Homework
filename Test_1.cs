Console.WriteLine("Welcome to the array sorter;");
Console.Write("Please enter the length of your array: ");
string[] arr = new string[int.Parse(Console.ReadLine())];
Console.WriteLine("Now input your array:");
for(int i = 0; i < arr.Length; i++) {
  Console.Write($"Element {i}: ");
  arr[i] = Console.ReadLine();}
int f = 0;
foreach(string e in arr) {
  if(e.Length <= 3){
    f += 1;}}
string[] E = new string[f];
int u = 0;
foreach(string e in arr) {
  if(e.Length <= 3){
    E[u] = e;
    Console.Write(e + ", ");
    u++;}}