# Design Guidelines: Car Rental Marketplace Platform

## Design Approach
Reference-based design inspired by Airbnb/Turo, emphasizing trust, visual appeal, and seamless UX. Sophisticated yet approachable aesthetic with image-centric vehicle showcase.

## Core Principles
1. **Trust & Credibility**: Verified badges, professional layouts, transparent information
2. **Visual Hierarchy**: Clear differentiation between Renter/Owner/Admin roles
3. **Image-Centric**: Vehicle photography as focal point with generous galleries
4. **Information Clarity**: Complex booking flows presented with clear UI patterns

## Color System

### Primary & Neutrals
- **Primary Blue**: `hsl(215 85% 35%)` - CTAs, navigation, key actions
- **Primary Light**: `hsl(215 85% 95%)` - Backgrounds, hover states
- **Dark Mode Primary**: `hsl(215 75% 45%)`
- **BG Light/Dark**: `hsl(0 0% 98%)` / `hsl(220 15% 10%)`
- **Surface Light/Dark**: `hsl(0 0% 100%)` / `hsl(220 15% 15%)`
- **Border Light/Dark**: `hsl(220 10% 85%)` / `hsl(220 10% 25%)`

### Semantic
- **Success**: `hsl(145 65% 42%)` - Verified badges, confirmations
- **Warning**: `hsl(35 90% 55%)` - Pending status, notices
- **Error**: `hsl(0 75% 50%)` - Errors, cancellations
- **Info**: `hsl(210 80% 50%)` - Information highlights
- **Accent Coral**: `hsl(15 85% 60%)` - Landing page CTAs only

## Typography

### Fonts
- **Primary**: Inter (UI, body text)
- **Display**: Manrope (headings, emphasis)
- **Monospace**: JetBrains Mono (booking codes, IDs)

### Scale
- **Display Large**: `text-6xl font-bold` - Hero headlines
- **Display Medium**: `text-4xl font-bold` - Section headers
- **H1**: `text-3xl font-semibold` - Page titles
- **H2**: `text-2xl font-semibold` - Card titles
- **H3**: `text-xl font-medium` - Component headers
- **Body Large**: `text-lg` - Featured descriptions
- **Body**: `text-base` - Standard text
- **Body Small**: `text-sm` - Secondary info
- **Caption**: `text-xs font-medium uppercase tracking-wide` - Labels

## Layout System

### Spacing
Use Tailwind units: **2, 4, 6, 8, 12, 16, 20, 24, 32**
- **Micro**: `p-2, gap-2` | **Component**: `p-4, p-6` | **Section**: `py-12, py-16, py-20` | **Page**: `px-4` (mobile), `px-8` (tablet), `px-16` (desktop)

### Grids
- **Car Listings**: `grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6`
- **Dashboard Metrics**: `grid-cols-2 md:grid-cols-4 gap-4`
- **Feature Cards**: `grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8`
- **Reviews**: `grid-cols-1 lg:grid-cols-2 gap-6`

### Containers
- **Full-width**: `w-full max-w-7xl mx-auto`
- **Content**: `max-w-6xl mx-auto`
- **Forms**: `max-w-2xl`
- **Dashboard**: `max-w-screen-2xl`

## Component Patterns

### Navigation
- Sticky top nav with logo, primary links, user avatar/menu, "List Your Car" CTA
- Role switcher dropdown (Renter/Owner toggle)
- Prominent search bar (location + date picker) - desktop: header, mobile: expandable
- Verification badge: green checkmark + "Verified" label

### Car Cards
- **Image**: 16:10 aspect ratio, `rounded-lg object-cover`
- **Title**: `text-lg font-semibold` - Make/model
- **Metadata**: Location icon, rating stars, price/day
- **Features**: Small icon row (automatic, seats, etc.)
- **Availability**: Badge (green "Available" / gray "Booked")
- **Hover**: `shadow-lg` lift + image zoom (`transition-all duration-200`)

### Booking Flow
- **Date Picker**: Calendar with available/unavailable dates marked
- **Time Selector**: 30-min increment dropdown
- **Location**: Map integration or autocomplete dropdown
- **Price Breakdown**: Sticky sidebar - base rate, duration, extras, taxes, total
- **Upload**: Drag-drop zone with previews, status indicators
- **Photos**: 2x2 grid for damage photos + camera access

### User Profiles
- **Header**: Cover image (optional), large avatar, verified badge, name, member since, rating
- **Stats**: `grid-cols-3` - trips completed, cars listed, response rate
- **Reviews**: Card layout with avatar, rating, date, comment
- **Verification**: Banner with progress checklist

### Dashboard
- **Metrics**: Large number, label, trend indicator, sparkline
- **Booking List**: Table (desktop) / card stack (mobile) with status badges
- **Calendar**: Full view with color-coded bookings
- **Revenue Chart**: Line/bar with date range selector
- **Quick Actions**: Grid of large icon buttons

### Forms
- **Text Inputs**: Rounded borders, `focus:ring-2 ring-primary`, label above `text-sm`
- **Selects**: Custom chevron, search for long lists
- **Checkboxes/Radio**: Primary color, clear labels
- **File Upload**: Dashed border drag zone, preview area
- **Date**: Calendar popup with clear date display

### Reviews & Ratings
- **Stars**: Large interactive (input), small read-only (display)
- **Review Card**: Avatar, name, date, stars, comment, helpful votes
- **Breakdown**: Horizontal bars for 1-5 star distribution
- **Owner Response**: Nested, indented, different background

### Status Badges
- **Verified**: Green bg + white checkmark
- **Pending**: Amber bg + clock icon
- **Booking**: Blue (Upcoming), green (Active), gray (Completed), red (Cancelled)
- **Features**: Small pills with icons (AC, GPS, Bluetooth)

### Modals
- **Confirmation**: Centered, checkmark animation, summary, next steps
- **Photo Upload**: Full-screen with camera preview, capture/retake
- **Profile Edit**: Slide-in panel (desktop) / full-screen (mobile)
- **Delete**: Small centered with warning icon, yes/no buttons

## Images & Assets

### Hero
- `h-[500px] lg:h-[600px]` panoramic shot of diverse vehicles
- Dark gradient overlay `rgba(0,0,0,0.5)` for text legibility
- Headline + CTAs positioned bottom third

### Car Images
- **Primary**: 3/4 angle exterior | **Gallery**: 6-8 images (interior, trunk, dashboard, wheels)
- **Aspect**: 16:10 consistent | **Format**: WebP, lazy load, blur placeholder

### Profile & Trust
- **Avatars**: Circular - 40px (small), 80px (medium), 120px (large)
- **Documents**: Thumbnail previews with expand
- **Partner Logos**: Grayscale (insurance, payment providers)
- **Stars**: Custom SVG (filled/half/empty states)

### Illustrations
- **Empty States**: "No bookings", "No cars listed"
- **Verification Flow**: ID upload, selfie capture, approval steps
- **Errors**: 404, connection errors

## Responsive

### Breakpoints
- **Base (mobile)**: Single column, bottom nav, expandable filters
- **md (768px)**: 2-column grids, side nav, compact header
- **lg (1024px)**: 3-column grids, full desktop nav, sidebars
- **xl (1280px)**: Max content width, additional whitespace

### Touch
- **Tap Targets**: Minimum 44x44px
- **Gestures**: Swipe for galleries, booking cards
- **Bottom Sheet**: Mobile filters, quick actions
- **Sticky**: Search bar, booking summary, primary CTAs

## Animations

### Micro-interactions
- **Hover**: `shadow-lg transition-all duration-200` for cards
- **Press**: `scale-95` on active
- **Stars**: Fill animation `duration-300`
- **Toggles**: Smooth slide transition

### Loading
- **Skeleton**: Pulse animation for cards, profiles
- **Spinner**: Simple circular, contextual positioning
- **Progress**: Step-based (booking), percentage (uploads)

### Transitions
- **Fade**: `opacity-0` to `opacity-100 duration-300`
- **Philosophy**: Instant, responsive feel - no heavy animations

## Accessibility & Dark Mode

### Dark Mode
- Auto-detect system preference + manual toggle
- All components adapted with WCAG AA contrast
- Input fields: `bg-surface-dark` with visible borders

### Accessibility
- **Keyboard**: Full tab order, visible focus states (`ring-2`)
- **ARIA**: Comprehensive labels for screen readers
- **Color**: Never sole information carrier
- **Alternatives**: Alt text for images, video transcripts

## Key Layouts

### Landing
Hero → Trust (3-col grid) → Featured Cars (3-col/scroll) → How It Works (3-step) → Testimonials (2-col) → Owner CTA (split) → Footer (multi-col)

### Search Results
Filters sidebar (collapsible) | Results grid | Map toggle | Load more/infinite scroll

### Car Detail
Gallery (hero + thumbnails) | Sticky booking card | Overview (2-col specs) | Host profile | Map | Reviews | Similar cars carousel

### User Dashboard
Welcome + verification banner → Stats (4-col) → Upcoming bookings → History (tabs) → Saved cars grid

### Owner Dashboard
Revenue overview + chart → Car performance table → Booking requests (accept/decline) → Calendar (month view) → Add Car FAB

**All implementations must maintain trust-building through verified badges, professional layouts, and transparent information display across all touchpoints.**