/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.esignet.plugin.mock.dto;

import lombok.Data;

@Data
public class BiometricData {

	private String format;
	private double version;
	private String value;
}
