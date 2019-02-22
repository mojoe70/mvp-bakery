package eu.darken.mvpbakery.example.screens.text;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import eu.darken.mvpbakery.base.Presenter;
import eu.darken.mvpbakery.injection.ComponentPresenter;


@TextComponent.Scope
public class TextPresenter extends ComponentPresenter<TextPresenter.View, TextComponent> {

    private String text;

    @Inject
    TextPresenter() {
    }

    @Override
    public void onBindChange(@Nullable View view) {
        super.onBindChange(view);
        onView(v -> v.showText(text));
        onView(v -> v.showPresenterInfo(this));
    }

    void onTextInput(String text) {
        this.text = text;
    }

    public interface View extends Presenter.View {
        void showText(String text);

        void showPresenterInfo(TextPresenter presenter);
    }
}
