package desing.pattern.structure.facade;

public class Computer {
	public final static long BOOT_ADDRESS = 234566;
	public final static long BOOT_SECTOR = 67743523;
	public final static int SECTOR_SIZE = 256;
	
	public void startComputer() {
        Cpu cpu = new Cpu();
        Memory memory = new Memory();
        Storage storage = new Storage();
		cpu.freeze();
		memory.load(BOOT_ADDRESS, storage.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
	}
}
