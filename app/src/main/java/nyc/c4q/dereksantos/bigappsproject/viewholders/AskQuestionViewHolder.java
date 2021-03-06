package nyc.c4q.dereksantos.bigappsproject.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.Question;


/**
 * Created by SACC on 1/29/17.
 */

public class AskQuestionViewHolder extends RecyclerView.ViewHolder {


    private final TextView titleTextView;
    private Button submitBtn;

    // private final TextView descriptionTextView;

    public AskQuestionViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        titleTextView = (TextView) itemView.findViewById(R.id.question_title_tv);
        // descriptionTextView = (TextView) itemView.findViewById(R.id.question_description_tv);
        submitBtn = (Button) itemView.findViewById(R.id.submit_btn);
    }

    public static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.ask_question_viewholder, parent, false);
    }

    public void bind(Question question) {
        titleTextView.setText(question.getTitle());
    }
}
