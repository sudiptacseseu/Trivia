package com.sudiptacseseu.trivia.data;

import com.sudiptacseseu.trivia.model.Question;
import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
