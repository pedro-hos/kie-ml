package org.fxapps.ml.api.provider.transform;

import java.util.List;

import org.fxapps.ml.api.model.Input;
import org.fxapps.ml.api.model.TransformParam;
import org.nd4j.linalg.api.ndarray.INDArray;

public interface Transformer {
	
	public String getName();
	
	public INDArray transform(List<TransformParam> params, Input input);

}
