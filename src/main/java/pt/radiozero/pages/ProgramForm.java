package pt.radiozero.pages;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

import pt.radiozero.models.Program;

public class ProgramForm extends GenericPanel<Program> {
	private static final long serialVersionUID = 1L;

	public ProgramForm(String id, IModel<Program> model) {
		super(id, model);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		Form<Program> form = new Form<>("form", getModel());
		add(form);
		form.add(new TextField<>("name", new PropertyModel<>(getModel(), "name")));
	}

}
