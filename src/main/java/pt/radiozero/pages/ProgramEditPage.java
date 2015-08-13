package pt.radiozero.pages;

import org.apache.wicket.markup.html.GenericWebPage;
import org.apache.wicket.model.IModel;

import pt.radiozero.models.Program;

public class ProgramEditPage extends GenericWebPage<Program> {

	private static final long serialVersionUID = 1L;

	public ProgramEditPage(IModel<Program> model) {
		super(model);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(new ProgramForm("form", getModel()));

	}
}
