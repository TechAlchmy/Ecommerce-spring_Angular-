import { FormControl, ValidationErrors } from "@angular/forms";

export class ShopValidators {

  //whitespace validation
  static notOnlyWhitespace(control: FormControl): ValidationErrors {
    if ((control.valid != null) && (control.value.trim().length === 0)) {
      // invalid, return error object
      return { 'notOnlyWhitespace': true }
    } else {
      return { 'notOnlyWhitespace': false };
    }

  }

}
