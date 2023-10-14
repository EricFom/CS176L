package edu.monmouth.problemSet2;

public class ProblemSet2 
{
	public static void main(String[] args) 
	{
		MusicalInstrument MusicalInstrument = new MusicalInstrument();
		
		System.out.println(MusicalInstrument.getName());
		System.out.println(MusicalInstrument.getType());
		System.out.println(MusicalInstrument.getNumberofKeysorStrings());
		
		MusicalInstrument.setName("Flute");
		MusicalInstrument.setType("Woodwind");
		MusicalInstrument.setNumberOfKeysorStrings(12);
		System.out.println(MusicalInstrument.getName());
		System.out.println(MusicalInstrument.getType());
		System.out.println(MusicalInstrument.getNumberofKeysorStrings());
		
		MusicalInstrument Violin = new MusicalInstrument("Violin","String",4);
		System.out.println(Violin.getName());
		System.out.println(Violin.getType());
		System.out.println(Violin.getNumberofKeysorStrings());
		
		Violin.setName("snare drum");
		Violin.setType("percussion");
		Violin.setNumberOfKeysorStrings(0);
		System.out.println(Violin.getName());
		System.out.println(Violin.getType());
		System.out.println(Violin.getNumberofKeysorStrings());
		
		MusicalInstrument Invalid = new MusicalInstrument("UNKNOWNNAME","43",-2);
		System.out.println(Invalid.getName());
		System.out.println(Invalid.getType());
		System.out.println(Invalid.getNumberofKeysorStrings());
		
		
}
}
