import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('landing-site')
export class LandingSite extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%; background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative; align-items: center; justify-content: space-evenly; " id="landing_site_header">
 <vaadin-button theme="tertiary" tabindex="0" id="home_button" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; ">
   Home 
 </vaadin-button>
 <vaadin-button theme="tertiary" tabindex="0" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black " id="view_cars_button">
   View cars 
 </vaadin-button>
 <vaadin-button theme="tertiary" tabindex="0" style="color: #3A7FC4; font-weight: bolder; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black " id="logInasUserButton">
   Log in as user 
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout theme="spacing" style="height: 35%; justify-content: center; background-color:lightgray;" id="landing_site_top_main">
 <img src="productLogo.png" alt="product logo" width="auto" height="300" style="flex-grow: 0; flex-shrink: 1; margin-bottom: 30%; padding: 0; padding-left: 0; padding-bottom: 0; padding-right: 0; padding-top: 10%;">
</vaadin-horizontal-layout>
<vaadin-horizontal-layout theme="spacing-l" style="height: 55%; background-color:lightgray; align-self: center; width: 100%; justify-content: center; flex-shrink: 1;" id="landing_site_bottom_main">
 <vaadin-button style="flex-grow: 0; color:#3A7FC4; background-color:#FFA600; border-radius: 20px; box-shadow: -10px 7px 8px #468edb; font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; width: 30%; flex-shrink: 1; align-self: center;" tabindex="0" id="login_button">
   Login 
 </vaadin-button>
 <vaadin-button style="flex-grow: 0; color:#3A7FC4; background-color:#FFA600; border-radius: 20px; box-shadow: -10px 7px 8px #468edb;  font-size: 22px; -webkit-text-stroke-width: 0.5px; -webkit-text-stroke-color: black; width: 30%; flex-shrink: 1; align-self: center;" tabindex="0" id="create_user_button">
   Create user 
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 5%; background-color:#FFA600; box-shadow: 1px 1px 25px black; position:relative; justify-content: flex-start; flex-direction: row; align-items: center;" id="landing_site_footer"></vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
