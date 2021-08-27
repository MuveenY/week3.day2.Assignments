package week3.day2.Assignments;

public class Desktop implements Hardware, Software {

	public void computerOS() {
		System.out.println("Computer OS = Windows 10");

	}

	public float computerJavaVersion() {
		float java = 1.80f;
		System.out.println("Computer Java version = " + java);

		return 0;
	}

	public int computerMakingYear() {
		int year = 2018;
		System.out.println("Computer Making Year = " + year);

		return 0;
	}

	public void computerProcessor() {
		System.out.println("Processor = intel i3");

	}

	public void computerDiskMemory() {
		System.out.println("Disk Memory = 500 GB");

	}

	public int computerRAM() {
		int RAM = 6;
		System.out.println("RAM = " + RAM + " GB");

		return 0;
	}

	// own methods
	void computerName() {
		System.out.println("Manufacturer = Dell");
	}

	void computerModel() {
		System.out.println("Model = Dell Inspiron");

	}

}
