package org.boehn.gef.modelgenerated;

public class Channel {

	private String id;
	private Adwords adwords;
	private AdsEnable adsEnable;
	private Description description;
	private LayerIndex layerIndex;
	private Name name;
	private PreserveTextLevel preserveTextLevel;
	private ShowState showState;
	private Snippet snippet;

	public Channel() {
	}

	public Channel(String id, Adwords adwords, AdsEnable adsEnable, Description description, LayerIndex layerIndex, Name name, PreserveTextLevel preserveTextLevel, ShowState showState, Snippet snippet) {
		this.id = id;
		this.adwords = adwords;
		this.adsEnable = adsEnable;
		this.description = description;
		this.layerIndex = layerIndex;
		this.name = name;
		this.preserveTextLevel = preserveTextLevel;
		this.showState = showState;
		this.snippet = snippet;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Adwords getAdwords() {
		return this.adwords;
	}

	public void setAdwords(Adwords adwords) {
		this.adwords = adwords;
	}

	public AdsEnable getAdsEnable() {
		return this.adsEnable;
	}

	public void setAdsEnable(AdsEnable adsEnable) {
		this.adsEnable = adsEnable;
	}

	public Description getDescription() {
		return this.description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public LayerIndex getLayerIndex() {
		return this.layerIndex;
	}

	public void setLayerIndex(LayerIndex layerIndex) {
		this.layerIndex = layerIndex;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PreserveTextLevel getPreserveTextLevel() {
		return this.preserveTextLevel;
	}

	public void setPreserveTextLevel(PreserveTextLevel preserveTextLevel) {
		this.preserveTextLevel = preserveTextLevel;
	}

	public ShowState getShowState() {
		return this.showState;
	}

	public void setShowState(ShowState showState) {
		this.showState = showState;
	}

	public Snippet getSnippet() {
		return this.snippet;
	}

	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Channel");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.adwords != null) {
			element.appendChild(this.adwords.getElement(xmlDocument));
		}
		if (this.adsEnable != null) {
			element.appendChild(this.adsEnable.getElement(xmlDocument));
		}
		if (this.description != null) {
			element.appendChild(this.description.getElement(xmlDocument));
		}
		if (this.layerIndex != null) {
			element.appendChild(this.layerIndex.getElement(xmlDocument));
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.preserveTextLevel != null) {
			element.appendChild(this.preserveTextLevel.getElement(xmlDocument));
		}
		if (this.showState != null) {
			element.appendChild(this.showState.getElement(xmlDocument));
		}
		if (this.snippet != null) {
			element.appendChild(this.snippet.getElement(xmlDocument));
		}

		return element;
	}
}
