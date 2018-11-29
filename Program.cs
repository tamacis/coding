using System;
using System.Collections.Generic;
using System.IO;

namespace ConsoleApplication
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            var lines = ReadFrom("SampleQuotes.txt");
foreach (var line in lines)
{
    Console.WriteLine(line); 
}
        }
  static IEnumerable <string> ReadFrom (string file)
        {
            string line;
            using (var reader = File.OpenText(file))
            {
                while ((line = reader.ReadLine()) != null)
                yield return line;
            }
        }

    }
}
