package edu.monmouth.problemSet1;
	//Eric Fomichev
	//CS176
public class ProblemSet1 {

	public static void main(String[] args) {
		MusicalInstrument MusicalInstrument = new MusicalInstrument();

		System.out.println(MusicalInstrument.getName());
		System.out.println(MusicalInstrument.getType());
		System.out.println(MusicalInstrument.getNumberOfKeysorStrings());
		
		MusicalInstrument.setName("Flute");
		MusicalInstrument.setType("Woodwind");
		MusicalInstrument.setNumberOfKeysorStrings(12);
		System.out.println(MusicalInstrument.getName());
		System.out.println(MusicalInstrument.getType());
		System.out.println(MusicalInstrument.getNumberOfKeysorStrings());
		
		MusicalInstrument Violin = new MusicalInstrument("Violin","String",4);
		System.out.println(Violin.getName());
		System.out.println(Violin.getType());
		System.out.println(Violin.getNumberOfKeysorStrings());
		
		
	}

}
