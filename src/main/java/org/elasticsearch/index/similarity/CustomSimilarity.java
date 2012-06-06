package org.elasticsearch.index.similarity;

import org.apache.lucene.search.DefaultSimilarity;
import org.apache.lucene.index.FieldInvertState;
/**
 * Custom similarity class
 * 
 * @author tanguy
 *
 */
@SuppressWarnings("serial")
public class CustomSimilarity extends DefaultSimilarity {

  @Override
  public float computeNorm(String field, FieldInvertState state) {
    return state.getBoost();
  }
  
}
