import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/login/src/vaadin-login-form.js';

@customElement('user-login')
export class UserLogin extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
          
      }
      `
        ;
  }

  render() {
    return html`
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%; background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative; justify-content: space-around;">
 <vaadin-button theme="tertiary" tabindex="0" id="home_button" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black ">
   Home 
 </vaadin-button>
 <vaadin-button theme="tertiary" tabindex="0" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black " id="view_cars_button">
   View cars 
 </vaadin-button>
 <vaadin-button theme="tertiary" tabindex="0" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black " id="logInasUserButton">
   Log in as user 
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-vertical-layout theme="spacing" style="background-color:lightgray; width: 100%; height: 90%; align-items: center;" id="background">
 <vaadin-login-form style="margin-top: 15%;" id="vaadinLoginForm"></vaadin-login-form>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%;  background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative;"></vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
