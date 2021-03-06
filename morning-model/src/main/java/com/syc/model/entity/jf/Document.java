

package com.syc.model.entity.jf;


import com.syc.model.entity.jf.base.BaseDocument;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Document extends BaseDocument<Document> {

	public static final int PUBLISH_NO = 0;    // 不发布
	public static final int PUBLISH_YES = 1;   // 发布

	public boolean isPublished() {
		return getPublish() == PUBLISH_YES;
	}

	public boolean notPublish() {
		return getPublish() == PUBLISH_NO;
	}
}

