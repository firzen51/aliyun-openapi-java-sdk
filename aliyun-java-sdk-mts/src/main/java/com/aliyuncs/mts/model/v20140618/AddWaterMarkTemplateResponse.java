/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.AddWaterMarkTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddWaterMarkTemplateResponse extends AcsResponse {

	private String requestId;

	private WaterMarkTemplate waterMarkTemplate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public WaterMarkTemplate getWaterMarkTemplate() {
		return this.waterMarkTemplate;
	}

	public void setWaterMarkTemplate(WaterMarkTemplate waterMarkTemplate) {
		this.waterMarkTemplate = waterMarkTemplate;
	}

	public static class WaterMarkTemplate {

		private String id;

		private String name;

		private String width;

		private String height;

		private String dx;

		private String dy;

		private String referPos;

		private String type;

		private String state;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public String getHeight() {
			return this.height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getDx() {
			return this.dx;
		}

		public void setDx(String dx) {
			this.dx = dx;
		}

		public String getDy() {
			return this.dy;
		}

		public void setDy(String dy) {
			this.dy = dy;
		}

		public String getReferPos() {
			return this.referPos;
		}

		public void setReferPos(String referPos) {
			this.referPos = referPos;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public AddWaterMarkTemplateResponse getInstance(UnmarshallerContext context) {
		return	AddWaterMarkTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
