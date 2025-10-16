# DriveHub - Car Rental Marketplace

## Project Overview
DriveHub is a premium car rental marketplace platform connecting renters with verified car owners. Built with React, TypeScript, Express, and PostgreSQL.

## Tech Stack
- **Frontend**: React, TypeScript, Wouter (routing), TanStack Query, Tailwind CSS, Shadcn UI
- **Backend**: Express.js, Node.js
- **Database**: PostgreSQL (Neon) with Drizzle ORM
- **Styling**: Tailwind CSS with custom design system
- **Fonts**: Inter (body), Manrope (display/headings), JetBrains Mono (monospace)

## Project Structure

### Frontend Pages
- `/` - Landing page with hero, featured cars, trust features
- `/browse` - Car catalog with filters and search
- `/cars/:id` - Car detail page with gallery, specs, booking
- `/login` - User authentication
- `/register` - User registration with role selection (renter/owner)
- `/profile` - User profile with reviews and stats
- `/dashboard` - Owner dashboard for managing cars and bookings
- `/booking` - Booking flow with trip details and payment

### Database Schema

#### Users Table
- Role-based (renter, owner, admin)
- Verification status (pending, approved, rejected)
- Profile information and contact details
- ID document and selfie URLs for verification

#### Cars Table
- Owner reference
- Make, model, year, type, transmission
- Pricing, location, features
- Images array
- Availability status

#### Bookings Table
- User and car references
- Start/end dates, pickup/dropoff locations
- Pricing, status (pending, confirmed, active, completed, cancelled)
- Payment status
- Pre/post rental photos for damage reporting
- Odometer readings

#### Reviews Table
- Bidirectional reviews (users ↔ owners)
- Booking reference
- Rating (1-5), comment
- Review type (car, renter, owner)

## Design System

### Colors
- Primary Blue: Used for CTAs, navigation
- Success Green (chart-2): Verified badges, confirmations
- Warning Amber (chart-3): Pending status, star ratings
- Coral Accent (chart-5): Landing page CTAs

### Typography
- Display: Manrope (headings, emphasis)
- Body: Inter (UI, body text)
- Monospace: JetBrains Mono (booking codes, IDs)

### Components
- All components follow design_guidelines.md
- Dark mode support via ThemeProvider
- Responsive design (mobile-first)
- Accessibility with proper ARIA labels and keyboard navigation

## Key Features (MVP)

### For Renters
- Browse and search cars by location, price, type
- View detailed car information with photos and specs
- Book cars with date selection
- Leave reviews for cars and owners
- View booking history

### For Owners
- List cars with detailed information
- Manage booking requests (accept/decline)
- View earnings and analytics
- Respond to reviews
- Track active and upcoming bookings

### Platform Features
- User verification system (pending implementation)
- Bidirectional review system
- Payment processing (mocked for MVP)
- Damage reporting with photo upload
- Role-based access control

## Development Status

### Completed (Task 1)
- ✅ Database schema with all models and relations
- ✅ Design system configuration
- ✅ All React components and pages
- ✅ Theme provider for dark mode
- ✅ Navigation and layout components
- ✅ Responsive design across all pages

### Next Steps (Task 2)
- Backend API implementation
- Database integration with Drizzle
- Authentication system
- File upload for car images and documents

### Future (Task 3)
- Frontend-backend integration
- Real-time booking availability
- Payment gateway integration
- Email notifications
- Admin dashboard

## Important Notes
- Design guidelines in `design_guidelines.md` must be followed
- All interactive elements have proper `data-testid` attributes for testing
- Components use shadcn UI primitives
- Dark mode support is built-in
- Authentication is currently mocked (to be implemented in Task 2)

## Environment Variables
- `DATABASE_URL` - PostgreSQL connection string (configured)
- `SESSION_SECRET` - Express session secret (configured)
- Additional secrets may be needed for payment, file storage, etc.

## Running the Application
```bash
npm run dev
```
This starts both the Express backend (port 5000) and Vite frontend, served together.

## Database Migrations
```bash
npm run db:push
```
Pushes schema changes to the database. Never write manual SQL migrations.
