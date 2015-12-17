package kratos.card;

import android.content.Context;

import kratos.BindText;
import kratos.Kratos;
import kratos.card.utils.Skip;
import kratos.internal.KString;
import me.ele.kratos_sample.R;
import me.ele.kratos_sample.entity.KText;

/**
 * Created by merlin on 15/12/17.
 */
public class TextCard extends KCard<KText> {
    @Skip
    @BindText(R.id.kcard_text_text)
    public KString _text = new KString();

    public TextCard(Context context) {
        super(context);
        Kratos.bind(this);
        setOnLinkListener();
    }

    @Override
    public void refresh() {
        if (getData() != null)
            _text.setData(getData().text);
    }

    @Override
    public int getResourceLayoutId() {
        return R.layout.kcard_text;
    }
}
