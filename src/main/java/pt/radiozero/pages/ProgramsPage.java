package pt.radiozero.pages;

import javax.inject.Inject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.PropertyModel;

import pt.radiozero.models.Program;
import pt.radiozero.services.ProgramsService;

public class ProgramsPage extends WebPage {
	private static final long serialVersionUID = 1L;

	@Inject
	private ProgramsService programsService;

	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(new ListView<Program>("programs", programsService.getPrograms()) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<Program> item) {
				item.add(new Label("name", new PropertyModel<>(item.getModel(), "name")));
			}
		});
	}
}
