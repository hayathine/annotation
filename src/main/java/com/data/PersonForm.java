package com.data;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
// Jsonを受け取るために必要
public class PersonForm {
	@NotNull
	@Size(min=1, max=256)
	private String name ;
}
