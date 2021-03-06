/*
 * Copyright (c) 2020 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */
package org.dpppt.android.sdk.backend.models;

public class ExposeeAuthMethodAuthorization implements ExposeeAuthMethod {

	private String authorization;

	public ExposeeAuthMethodAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getAuthorization() {
		return authorization;
	}

}
