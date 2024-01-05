import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('create-user')
export class CreateUser extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%; background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative; align-items: center; justify-content: space-evenly; ">
 <vaadin-button theme="tertiary" tabindex="0" id="home_button" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; ">
   Home 
 </vaadin-button>
 <vaadin-button theme="tertiary" tabindex="0" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black " id="view_cars_button">
   View cars 
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-vertical-layout style="background-color:lightgray; width: 100%; height: 90%; justify-content: flex-start;">
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="First Name:" style="flex-grow: 0; flex-shrink: 0; width: 80%; margin-top: 5%; align-self: center;" type="text" id="first-name-field"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="Last Name:" style="width: 80%; align-self: center;" type="text" id="last-name-field"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="Address" style="flex-grow: 0; flex-shrink: 0; width: 80%; margin-top: 0; align-self: center;" type="text" id="address-field"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="Email:" style="width: 80%; align-self: center;" type="text" id="mail-field"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="National ID Number:" style="width: 80%; align-self: center;" type="text" id="id-number-field"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="Phone Number:" style="width: 80%; align-self: center;" type="text" id="phone-number-field"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="Password:" style="width: 80%; align-self: center;" type="text" id="password-field"></vaadin-text-field>
 <vaadin-text-field error-message="Please enter a value" required invalid="" label="Confirm Password:" style="width: 80%; align-self: center;" type="text" id="confirm-password-field"></vaadin-text-field>
 <vaadin-button id="user-creation-button" style="align-self: center; background-color:#FFA600; margin-top: var(--lumo-space-l); width: 30%;" tabindex="0">
   Create User 
 </vaadin-button>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%; background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative; justify-content: space-evenly;"></vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
