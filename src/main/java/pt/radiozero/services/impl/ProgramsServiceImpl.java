package pt.radiozero.services.impl;

import java.util.ArrayList;
import java.util.List;

import pt.radiozero.models.Program;
import pt.radiozero.services.ProgramsService;

public class ProgramsServiceImpl implements ProgramsService {

	@Override
	public List<Program> getPrograms() {
		List<Program> programs = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Program p = new Program();
			p.setName("program " + i);
			programs.add(p);
		}
		return programs;
	}

}
