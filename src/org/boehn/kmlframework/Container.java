package org.boehn.kmlframework;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Feature {
	List<Feature> features;
	
	public Container() {
		features = new ArrayList<Feature>();
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	
	public void add(Feature feature) {
		if (features == null) {
			features = new ArrayList<Feature>();
		}
		features.add(feature);
	}
	
	public void writeInner(KmlDocument kmlDocument) throws KmlException {
		if (features != null) {
			for (Feature feature: features) {
				feature.write(kmlDocument);
			}
		}
	}
}
