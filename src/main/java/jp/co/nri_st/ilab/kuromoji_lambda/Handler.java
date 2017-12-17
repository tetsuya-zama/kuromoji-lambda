/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.nri_st.ilab.kuromoji_lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;
import java.util.List;



/**
 *
 * @author zamatetsuya
 */
public class Handler implements RequestHandler<String,List<Token>>{

    @Override
    public List<Token> handleRequest(final String input, final Context context) {
        final Tokenizer tokenizer = new Tokenizer();
        final List<Token> tokens = tokenizer.tokenize(input);
        return tokens;
    }
}
